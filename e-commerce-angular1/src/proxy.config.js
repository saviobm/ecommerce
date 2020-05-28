const proxy = [
  {
    context: '/login',
    target: 'http://localhost:9000',
    pathRewrite: {'^/login' : ''}
  }
];

module.exports = proxy;
