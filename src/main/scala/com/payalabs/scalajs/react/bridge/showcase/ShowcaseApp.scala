package com.payalabs.scalajs.react.bridge.showcase

import com.payalabs.scalajs.react.bridge._
import com.payalabs.scalajs.react.bridge.elements.{ReactMediumEditor, Input, Button, TagsInput}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{React, ReactComponentB}
import org.scalajs.dom

import scala.scalajs.js

object ShowcaseApp extends js.JSApp {
  def main(): Unit = {

    def printSequence(value: js.Array[String]) : Unit = {
      println(s"Value is ${value.mkString(",")}")
    }

    val component = ReactComponentB[Unit]("ShowcaseApp").render { _ =>
      div(className := "col-sm-10 col-sm-offset-1")(
        h1()(
          "Example components created with ",
          a(href := "https://github.com/payalabs/scalajs-react-bridge")("scalajs-react-bridge")
        ),
        div(className := "well")(
          b("Tags input (open Inspect Element to see callback being called as you make changes)"),
          TagsInput(defaultValue = Seq("some", "default", "values"), onChange = printSequence _)()
        ),
        div(className := "well")(
          ReactMediumEditor(text =
            """
            | <h1>Medium Editor</h1>
            |
            | <p>Click here and start editing.</p>
            |
            | <b>Select some text to see the editor toolbar pop up.</b>
            """.stripMargin, options = Map("buttons" -> js.Array("bold", "italic", "underline", "anchor", "header1", "header2", "quote", "orderedlist", "unorderedlist")))()
        ),
        div(className := "well")(
          b("Bootstrap"),
          Input(placeholder = "This is a bootstrap input", `type` = "text")(),
          Button()("Bootstrap Button")
        )
      )
    }.build(())

    React.render(component, dom.document.body)
  }
}
