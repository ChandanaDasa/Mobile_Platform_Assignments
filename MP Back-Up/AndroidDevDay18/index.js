const express = require('express')
const app= express()
//GET Request (ENDPOINTS)
app.get("/",(req, res)=>{
    res.end("Hello world")
})

//http://localhost:8080/about
app.get("/about",(req,res)=>{
    res.end("welcome to about page")
})

//http://localhost:8080/name/chandana
app.get("/name/:myname",(req, res)=>{
    res.end("welcome"+ req.params.myname)
})
//POST Request (ENDPOINTS)
//TODO body-parser

app.post("/login", (req , res)=>{
    const body=req.body;
    const username=body.username;
    const pass= body.pass;
     
    if(username==="chandana"&& pass===123)
       res.end("Lgged in successfully")
    res.end("Incorrect  creds")
})

//http://localhost:8080/
app.listen(8080,()=>console.log("Application started"))