(() => {
  /*  const login = (email: string, password: string) => {
    console.log(email, password);
  }; */

  type ObectInfo = { email: string; password: string | number };

  const login = (info: ObectInfo) => {
    console.log(info.email, info.password);
  };

  //login('sebas@gmail.com', '324235');
  login({
    email: 'sebas@gmail.com',
    password: 11314,
  });

  type Sizes = 'S' | 'M' | 'L' | 'XL';

  const products: any[] = [];
  const addProduct = (data: {
    title: string;
    createAt: Date;
    stock: number;
    size?: Sizes;
  }) => {
    products.push(data);
  };

  addProduct({ title: 'Pro1', createAt: new Date(1991, 1, 1), stock: 12 });
  addProduct({
    title: 'Pro1',
    createAt: new Date(1991, 1, 1),
    stock: 12,
    size: 'S',
  });
  console.log(products);
})();
