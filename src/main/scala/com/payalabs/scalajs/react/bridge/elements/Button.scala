package com.payalabs.scalajs.react.bridge.elements

import scala.scalajs.js

case class Button(id: js.UndefOr[String]  = js.undefined, className: js.UndefOr[String] = js.undefined,
                  ref: js.UndefOr[String] = js.undefined, key: js.UndefOr[Any] = js.undefined,
                  bsStyle: js.UndefOr[String] = js.undefined,
                  bsSize: js.UndefOr[String] = js.undefined,
                  active: js.UndefOr[Boolean] = js.undefined,
                  block: js.UndefOr[Boolean] = js.undefined,
                  disabled: js.UndefOr[Boolean] = js.undefined,
                  href: js.UndefOr[String] = js.undefined,
                  onClick: js.UndefOr[() => Unit] = js.undefined)
  extends ReactBootstrapComponent
