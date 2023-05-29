(() => {
  let myDynamicVar: any;
  let userId: string | number;
  userId = 111;
  userId = 'hola';

  function greeting(myText: string | number) {
    if (typeof myText === 'string') {
      console.log(`string ${myText.toLocaleLowerCase()}`);
    } else {
      console.log(`number ${myText.toFixed()}`);
    }
  }
  greeting(123);
  greeting('Sebastian');
  greeting(12.122213233);
})();
