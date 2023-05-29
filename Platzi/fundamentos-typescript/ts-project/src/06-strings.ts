(() => {
  let productTitle: string = 'My amazing product';
  productTitle = 'My amazing product changed';
  console.log('productTitle', productTitle);

  const productDescription = "I'm sebas";
  console.log('productDescription', productDescription);

  const summary = `Estos son los template literals
  ${productTitle}
  ${productDescription}
  `;
})();
