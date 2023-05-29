(() => {
  let myDynamicVar: any;
  myDynamicVar = 100;
  myDynamicVar = null;
  myDynamicVar = {};
  myDynamicVar = '';

  myDynamicVar = 'Hola';
  const rta = (myDynamicVar as string).toLocaleLowerCase();
  console.log(rta);

  myDynamicVar = 1212;
  const rtaDos = (<number>myDynamicVar).toFixed();
})();
