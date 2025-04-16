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
fun LogInScreen(){
    var userText by remember { mutableStateOf("") }
    var passwordTexr by remember { mutableStateOf("") }

    Column(
        modifier  = Modifier.fillMaxSize().padding(26.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        //Titulo
        Text(
            text = "Iniciar Sesión",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            style = MaterialTheme.typography.headlineLarge
        )

        //Para ingresar el Usuario
        TextField(
            value = userText,
            onValueChange = { userText = it },
            label = { Text("Usuario") },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        //Para ingresar la contraseña con PasswordVisualTransformation
        TextField(
            value = passwordTexr,
            onValueChange = { passwordTexr = it },
            label = { Text("Contraseña") },
            modifier = Modifier.align(Alignment.CenterHorizontally),
            visualTransformation = PasswordVisualTransformation()
        )

        //Boton Iniciar Sesión
        Button(
            onClick = {
                //NavigateToHome()
            },
            enabled = userText.isNotBlank() && passwordTexr.isNotBlank(),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ){
            Text(text = "Iniciar Sesión")
        }

    }

}