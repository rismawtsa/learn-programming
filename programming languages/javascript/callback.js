/**
 * setTimeout(functionRef, delay, param1, param2, ..., paramN)
 * paramN: Additional arguments which are passed through to the function specified by functionRef
 */
function test1(callback) {
  setTimeout(callback, 2000, null, "result");
}

function test2(param, callback) {
  setTimeout(() => {
    callback(null, param);
  }, 2000);
}

// test1((error1, result1) => {
//   if (error1) console.log("error1");
//   else {
//     test2(result1, (error2, result2) => {
//       if (error2) console.log("error2");
//       else console.log({ result2 });
//     });
//   }
// });

// const promise1 = new Promise((resolve, reject) => {
//   setTimeout(() => {
//     reject(new Error("Whoops!"));
//   }, 1000);
// });

const promise2 = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("Yeah!");
  }, 2000);
});

promise2.then((res) => console.log({ res }));
console.log("i'm outside");

async function aw() {
  const res = await promise2;
  console.log({ res });
  console.log("i'm in aw function");
}

// aw();
