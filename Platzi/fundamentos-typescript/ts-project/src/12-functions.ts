(() => {
  type Sizes = 'S' | 'L' | 'XL';
  function createProductToJson(
    title: string,
    createAt: Date,
    stock: number,
    size: Sizes
  ) {
    return {
      title,
      createAt,
      stock,
      size,
    };
  }

  const producto1 = createProductToJson('Producto1', new Date(), 3, 'L');
  console.log(producto1);
  console.log(producto1.title);
  console.log(producto1.stock);

  const createProductToJson2 = (
    title: string,
    createAt: Date,
    stock: number,
    size?: Sizes
  ) => {
    return {
      title,
      createAt,
      stock,
      size,
    };
  };

  const producto2 = createProductToJson2('Producto1', new Date(), 3);
  console.log(producto2);
  console.log(producto2.title);
  console.log(producto2.stock);
  console.log(producto2.size);
})();
