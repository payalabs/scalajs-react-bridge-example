package com.payalabs.scalajs.react.bridge.elements

import com.payalabs.scalajs.react.bridge.ReactBridgeComponent
import japgolly.scalajs.react.Callback

import scala.scalajs.js

/**
 * Bridge to [ReactMediumEditor](https://github.com/wangzuo/react-medium-editor)'s component
 */
case class ReactMediumEditor(id: js.UndefOr[String]  = js.undefined, className: js.UndefOr[String] = js.undefined,
                             ref: js.UndefOr[String] = js.undefined, key: js.UndefOr[Any] = js.undefined,
                             text: js.UndefOr[String] = js.undefined,
                             onChange: js.UndefOr[String => Callback] = js.undefined,
                             options: js.UndefOr[Map[String, Any]] = js.undefined)
  extends ReactBridgeComponent
