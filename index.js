var { requireNativeComponent, PropTypes } = require('react-native');

var iface = {
  name: 'FlipView'
  /* propTypes: {
    streamUrl: PropTypes.string
  } */
};

module.exports = requireNativeComponent('RCTFlipView', iface);