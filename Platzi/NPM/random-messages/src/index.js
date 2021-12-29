const messages = [
    "oscar",
    "Ana",
    "Nicoay",
    "Yesica",
    "Diego",
    "Laura"
];

const randomMsg = () => {
    const  message = messages[Math.floor(Math.random()*messages.length)];
    console.log(messsage);
}

module.exports = { randomMsg };