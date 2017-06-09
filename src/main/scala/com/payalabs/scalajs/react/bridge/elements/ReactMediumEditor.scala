package com.payalabs.scalajs.react.bridge.elements

import com.payalabs.scalajs.react.bridge.ReactBridgeComponent
import japgolly.scalajs.react.{Callback, Key}

import scala.scalajs.js

/**
 * Bridge to [ReactMediumEditor](https://github.com/wangzuo/react-medium-editor)'s component
 */
object ReactMediumEditor extends ReactBridgeComponent {
  def apply(id: js.UndefOr[String]  = js.undefined, className: js.UndefOr[String] = js.undefined,
            ref: js.UndefOr[String] = js.undefined, key: js.UndefOr[Key] = js.undefined,
            text: js.UndefOr[String] = js.undefined,
            onChange: js.UndefOr[String => Callback] = js.undefined,
            options: js.UndefOr[Map[String, Any]] = js.undefined): Component = this.autoConstruct
}
