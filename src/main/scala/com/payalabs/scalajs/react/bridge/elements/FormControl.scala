package com.payalabs.scalajs.react.bridge.elements

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.SyntheticEvent
import org.scalajs.dom.html

import scala.scalajs.js

/**
 * Bridge to [ReactBootstrap](http://react-bootstrap.github.io/)'s Input component
 */
object FormControl extends ReactBootstrapComponent {
  def apply(id: js.UndefOr[String]  = js.undefined, className: js.UndefOr[String] = js.undefined,
            ref: js.UndefOr[String] = js.undefined, key: js.UndefOr[Key] = js.undefined,
            `type`: js.UndefOr[String] = js.undefined,
            label: js.UndefOr[String] = js.undefined,
            help: js.UndefOr[String] = js.undefined,
            placeholder: js.UndefOr[String] = js.undefined,
            bsStyle: js.UndefOr[String] = js.undefined,
            hasFeedback: js.UndefOr[Boolean] = js.undefined,
            groupClassName: js.UndefOr[String] = js.undefined,
            wrapperClassName: js.UndefOr[String] = js.undefined,
            labelClassName: js.UndefOr[String] = js.undefined,
            onChange: js.UndefOr[(SyntheticEvent[html.Input]) => Unit] = js.undefined,
            onKeyDown: js.UndefOr[(ReactKeyboardEvent) => Unit] = js.undefined,
            value: js.UndefOr[String] = js.undefined,
            defaultValue: js.UndefOr[String] = js.undefined,
            multiple: js.UndefOr[Boolean] = js.undefined,
            readOnly: js.UndefOr[Boolean] = js.undefined,
            checked: js.UndefOr[Boolean] = js.undefined,
            disabled: js.UndefOr[Boolean] = js.undefined): Component = this.autoConstruct
}
