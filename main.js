__webpack_public_path__ = "/";

React = require("react");

if (__PRODUCTION__) {
    require('./target/scala-2.11/scalajs-react-bridge-example-opt.js');
} else {
    require('./target/scala-2.11/scalajs-react-bridge-example-fastopt.js');
}

require('file?name=./index.html!./index.html');

TagsInput = require('react-tagsinput');
require('react-tagsinput/react-tagsinput.css');

ReactMediumEditor = require('react-medium-editor');
require('react-medium-editor/node_modules/medium-editor/dist/css/medium-editor.css');
require('react-medium-editor/node_modules/medium-editor/dist/css/themes/flat.css');

ReactBootstrap = require("react-bootstrap");
