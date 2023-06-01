package com.example.calcolatrice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calcolatrice.ui.theme.CalcolatriceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalcolatriceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   Calcolatrice()
                }
            }
        }
    }
}
@Preview
@Composable
fun Calcolatrice(){
   Column(
       verticalArrangement = Arrangement.Top,
       horizontalAlignment = Alignment.CenterHorizontally,
       modifier = Modifier
           .fillMaxSize()

){
       Text(
           text = "Calculador de Gasto com Passagem por mês",
           fontSize = 29.sp,
           fontWeight = FontWeight.Bold,
           fontFamily = FontFamily.Default,
           modifier = Modifier
               .padding(3.dp)
   )
       TextField(
           value =,
           onValueChange =
       )

       TextField(
           value =  ,
           onValueChange =
       )

   }

}
@OptIn(ExperimentalMaterial3Api)
@Composable
fun  qtdPassagem(
    passagemAtual:Int
):Double(
  var valorIda by remember { mutableStateOf("")}
  var valorVolta by remember { mutableStateOf("")}




)







