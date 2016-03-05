package com.payalabs.scalajs.react.bridge.elements

import com.payalabs.scalajs.react.bridge.ReactBridgeComponent
import japgolly.scalajs.react.{CallbackTo, Callback}

import scala.scalajs.js

/**
 * Bridge to [TagsInput](https://github.com/olahol/react-tagsinput)'s component
 */
case class TagsInput(id: js.UndefOr[String]  = js.undefined, className: js.UndefOr[String] = js.undefined,
                     ref: js.UndefOr[String] = js.undefined, key: js.UndefOr[Any] = js.undefined,
                     defaultValue: js.UndefOr[Seq[String]] = js.undefined,
                     value: js.UndefOr[Array[String]] = js.undefined,
                     placeholder: js.UndefOr[String] = js.undefined,
                     onChange: js.UndefOr[js.Array[String] => Callback] = js.undefined,
                     validate: js.UndefOr[String => CallbackTo[Boolean]] = js.undefined,
                     transform: js.UndefOr[String => CallbackTo[String]] = js.undefined)
  extends ReactBridgeComponent
