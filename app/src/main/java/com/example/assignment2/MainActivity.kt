package com.example.assignment2
/*
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 13 2022
 */
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.assignment2.ui.theme.ASSIGNMENT2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ASSIGNMENT2Theme {
                val visible:MutableState<Boolean> = remember { mutableStateOf(false) }
                AlertDialogComponent(visible = visible)


                  var text=Message("Welcome to My Jetpack Compose Journey")
                  main(text)
                Column(
                    verticalArrangement=Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(painter = painterResource(id = R.drawable.photo), contentDescription = null)
                    val context= LocalContext.current
                    Button(onClick = {
                        visible.value=true},
                        shape= CircleShape,
                        contentPadding = PaddingValues(16.dp),
                        border= BorderStroke(10.dp, Color.White),
                        modifier = Modifier.size(width = 200.dp,height = 60.dp),
                        colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Blue, contentColor = Color.White
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Info,
                            contentDescription = "Info description",
                            Modifier.padding(end = 20.dp)
                        )
                        Text(text = "Info",
                            style= MaterialTheme.typography.button,
                            modifier= Modifier.padding(5.dp))
                    }

                }

            }
        }
    }
}
data class Message(var msg:String)

@Composable
fun main(message: Message)
{
    Column(modifier= Modifier
        .background(Color.Black)
        .padding(all = 6.dp)){
        Text(text ="${message.msg}", color=MaterialTheme.colors.surface,style= MaterialTheme.typography.h6,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            textAlign = TextAlign.Center)}
    }




@Composable
fun AlertDialogComponent(visible:MutableState<Boolean>) 
{

 if(visible.value){
     AlertDialog(
         onDismissRequest = { visible.value=false },
         dismissButton = {
             TextButton(onClick = {visible.value=false}) {
                        Text(text = "Cancel",color= Color.White,style= MaterialTheme.typography.subtitle1,
                            modifier = Modifier.background(Color.Black))
             }
         },
         confirmButton = {
             TextButton(onClick = {visible.value=false}) {
                 Text(text = "OK",color= Color.White,style= MaterialTheme.typography.subtitle1,
                     modifier = Modifier.background(Color.Black))
             }
         },
         title = { Text(text = "My Journey",color= Color.White,style= MaterialTheme.typography.subtitle1,
             modifier = Modifier.background(Color.Black))},
         text = { Text(text = "Thank you for your interest in my Jetpack Compose journey, and I'd like to welcome you in this journey that I have started. \n" +
                 "\n" +
                 "\n" +
                 "I am elated to take this journey and I am still enjoying and still interested to explore on it. \n" +
                 "\n" +
                 " I find the Jetpack Compose very fun and easy to learn. I see it as the future of the Andriod development life. The compose makes it easier for me to write and maintain my apps in this way it makes my life easier. \n" +
                 "\n" +
                 "My perception on the Mobile development elective is very exciting, fun and educational at the same time. The Elective has taught me a lot since last year until now and I still have the\n" +
                 "urge to learn more. It is not an easy journey but it is a road that I am willing to take and to grow on it. \n" +
                 "\n" +
                 "Thank you.",color= Color.White,style= MaterialTheme.typography.subtitle1,
             modifier = Modifier.background(Color.Black))
             }
     ) 
         
     
 }}
    



