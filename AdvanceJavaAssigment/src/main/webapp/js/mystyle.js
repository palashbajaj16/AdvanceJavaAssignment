let lpass = document.getElementById("login_password");
console.log(lpass);
lpass.addEventListener("blur", () => {
    console.log("password is blurred");
    // validate here
    let regex = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$/;
    let str = lpass.value;
    console.log(regex, str);
    if (regex.test(str)) {
      console.log("Your password is valid");
    } else {
      console.log("Your password is not valid");
      lpass.classList.add("is-invalid");
    }
  });