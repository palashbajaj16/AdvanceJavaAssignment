let fname = document.getElementById("signup_fname");
let lname = document.getElementById("signup_lname");
let lpass = document.getElementById("login_password");

fname.addEventListener("blur", () => {
    console.log("name is blurred");
    let regex = /^[a-zA-Z_ ]([a-zA-Z_ ]){2,20}$/;
    let str = fname.value;
    console.log(regex, str);
    if (regex.test(str)) {
      console.log("Your name is valid");
      document.getElementById("fname_valid").innerHTML = "";
    } else {
      console.log("Your name is not valid");
      document.getElementById("fname_valid").innerHTML = "Your fname is not valid";
    }
  });

lname.addEventListener("blur", () => {
    console.log("name is blurred");
    let regex = /^[a-zA-Z_ ]([a-zA-Z_ ]){2,20}$/;
    let str = lname.value;
    console.log(regex, str);
    if (regex.test(str)) {
      console.log("Your name is valid");
      document.getElementById("lname_valid").innerHTML = "";
    } else {
      console.log("Your name is not valid");
      document.getElementById("lname_valid").innerHTML = "Your lname is not valid";
    }
  });

lpass.addEventListener("blur", () => {
    console.log("password is blurred");
    // validate here
    let regex = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$/;
    let str = lpass.value;
    console.log(regex, str);
    if (regex.test(str)) {
      console.log("Your password is valid");
	  document.getElementById("demo").innerHTML = "";
    } else {
      console.log("Your password is not valid");
      document.getElementById("demo").innerHTML = "Your password is valid";
    }
  });