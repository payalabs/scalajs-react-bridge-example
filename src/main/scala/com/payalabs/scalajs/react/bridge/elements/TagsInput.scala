package com.payalabs.scalajs.react.bridge.elements

import com.payalabs.scalajs.react.bridge.ReactBridgeComponent

import scala.scalajs.js

/**
 * Bridge to [TagsInput](https://github.com/olahol/react-tagsinput)'s component
 */
case class TagsInput(id: js.UndefOr[String]  = js.undefined, className: js.UndefOr[String] = js.undefined,
                     ref: js.UndefOr[String] = js.undefined, key: js.UndefOr[Any] = js.undefined,
                     defaultValue: js.UndefOr[Seq[String]] = js.undefined,
                     value: js.UndefOr[Array[String]] = js.undefined,
                     placeholder: js.UndefOr[String] = js.undefined,
                     onChange: js.UndefOr[js.Array[String] => Unit] = js.undefined,
                     validate: js.UndefOr[String => Boolean] = js.undefined,
                     transform: js.UndefOr[String => String] = js.undefined)
  extends ReactBridgeComponent
