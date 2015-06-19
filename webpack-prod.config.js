var config = module.exports = require("./webpack.config.js");
var webpack = require('webpack');
var _ = require('lodash');

config = _.merge(config, {
    externals : {
        "react" : "React"
    }
});


var StringReplacePlugin = require("string-replace-webpack-plugin");

config.module.loaders.push({
    test: /index.html$/,
    loader: StringReplacePlugin.replace({
        replacements: [
            {
                pattern: /<!-- externals to be replaced by webpack StringReplacePlugin -->/ig,
                replacement: function (match, p1, offset, string) {
                    return '<script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/react/0.13.3/react-with-addons.js"></script>';
                }
            }
        ]})
    }
);

var definePlugin = new webpack.DefinePlugin({
  __PRODUCTION__ : true
});

config.plugins.push(
    new StringReplacePlugin(),
    definePlugin
)