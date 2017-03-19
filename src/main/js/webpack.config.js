var path = require('path');
var DIST_DIR = path.resolve(__dirname, '../resources/static/dist')
var APP_DIR = path.resolve(__dirname, 'app')

module.exports = {
  entry: './app/index.js',
  output: {
    filename: 'bundle.js',
    path: DIST_DIR
  },
  module: {
    loaders: [
      {
        test: /\.jsx?$/,
        include: APP_DIR,
        loader: 'babel-loader',
        options: {
          presets: ["es2015", "react"]
        }
      }
    ],
  },
  devtool: "eval-source-map"
};
