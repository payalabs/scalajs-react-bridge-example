package com.payalabs.scalajs.react.bridge.elements

import japgolly.scalajs.react.Key

import scala.scalajs.js

/**
 * Bridge to [ReactBootstrap](http://react-bootstrap.github.io/)'s Button component
 */
case class Button(id: js.UndefOr[String]  = js.undefined, className: js.UndefOr[String] = js.undefined,
                  ref: js.UndefOr[String] = js.undefined, key: js.UndefOr[Key] = js.undefined,
                  bsStyle: js.UndefOr[String] = js.undefined,
                  bsSize: js.UndefOr[String] = js.undefined,
                  active: js.UndefOr[Boolean] = js.undefined,
                  block: js.UndefOr[Boolean] = js.undefined,
                  disabled: js.UndefOr[Boolean] = js.undefined,
                  href: js.UndefOr[String] = js.undefined,
                  onClick: js.UndefOr[() => Unit] = js.undefined)
  extends ReactBootstrapComponent
