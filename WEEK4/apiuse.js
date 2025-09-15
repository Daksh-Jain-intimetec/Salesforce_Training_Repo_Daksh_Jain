const URL = "http://cat-fact.herokuapp.com/facts";
const para = document.querySelector("#facts");
const btn = document.querySelector("#getFact");
btn.addEventListener("click", getFacts);


const getFacts = async () => { 
    console.log("getting facts");
    let response =  await fetch(URL); // fetch returns a promise object 
    console.log("Response", response);
    console.log("Status Code", response.status); // response.status returns the status code of the response
    let data = await response.json(); // response.json() returns a promise that resolves with the result of parsing the body text as JSON
    para.innerHTML = data[2].text

};


// json() method of the Response interface takes a Response stream and reads it to completion. It returns a promise that resolves with the result of parsing the body text as JSON.
// It is important to note that the json() method returns a promise, which resolves with the result of parsing the body text as JSON.