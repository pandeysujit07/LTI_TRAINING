//using an inbuilt library

const fs=require('fs'); //similar to import Java

fs.readFile('sample.txt','utf8',(err,data)=>{

    if(err) throw err;
    else
    console.log(data);
})