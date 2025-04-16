package dev.einfantesv

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun SignUpScreen(){

    var userText by remember{ mutableStateOf("") }
    var passwordText by remember{ mutableStateOf("") }
    var confirmPasswordText by remember{ mutableStateOf("") }
    var emailText by remember{ mutableStateOf("") }

    Column(
        modifier = Modifier.
        fillMaxSize().padding(26.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        //Titulo
        Text(
            text = "Crear Cuenta",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            //style = MaterialTheme.typography.headlineLarge
        )

        //Para ingresar el Usuario
        TextField(
            value = userText,
            onValueChange = { userText = it },
            label = { Text("Nombre") },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        //Para ingresar la correo
        TextField(
            value = emailText,
            onValueChange = { emailText = it },
            label = { Text("Correo") },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        //Para ingresar la contraseña
        TextField(
            value = passwordText,
            onValueChange = { passwordText = it },
            label = { Text("Contraseña") },
            modifier = Modifier.align(Alignment.CenterHorizontally),
            visualTransformation = PasswordVisualTransformation()
        )

        //Para confirmar la contraseña
        TextField(
            value = confirmPasswordText,
            onValueChange = { confirmPasswordText = it },
            label = { Text("Confirmar Contraseña") },
            modifier = Modifier.align(Alignment.CenterHorizontally),
            visualTransformation = PasswordVisualTransformation()
        )

        //Boton para crear la cuenta
        Button(
            onClick = {
            },
            enabled = passwordText == confirmPasswordText && userText.isNotBlank() && passwordText.isNotBlank() && confirmPasswordText.isNotBlank() && emailText.isNotBlank(),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Crear Cuenta")
        }


    }

}

