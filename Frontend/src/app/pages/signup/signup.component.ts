import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  public user = {
    userName : '',
    password : '',
    names : '',
    surnames : '',
    emai : ''
  }
  constructor(private userService : UserService) { }

  ngOnInit(): void {
  }
  formSubmit(){
    console.log(this.user);
    if(this.user.userName == "" || null){
      alert("El nombre de usuario es obligatorio");
      return;
    }

    this.userService.addUser(this.user).subscribe(
      (data)=>{
        console.log(data);
        alert("Se guardó correctamente el usuario");
      },(error) =>{
        console.log(error);
        alert("No se guardaron los datos");
      }

    )
  }

}

