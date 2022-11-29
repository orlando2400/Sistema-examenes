import Swal from 'sweetalert2';
import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { UserService } from '../../services/user.service';

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
    email: ''
  }

  constructor(private userService : UserService, private snack:MatSnackBar) { }

  ngOnInit(): void {

  }

  formSubmit(){
    console.log(this.user);
    if(this.user.userName == '' || this.user.userName == null){
      this.snack.open('El nombre de usuario es requerido !!','Aceptar',{
        duration : 2000,
        verticalPosition : 'top',
        horizontalPosition : 'right'
      });
      return;
    }

    this.userService.addUser(this.user).subscribe(
      (data) => {
        console.log(data);
        Swal.fire('Usuario guardado','Usuario registrado con exito en el sistema','success');
      },(error) => {
        console.log(error);
        this.snack.open('Ha ocurrido un error en el sistema !!','Aceptar',{
          duration : 3000
        });
      }
    )
  }

}

