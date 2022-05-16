package com.example.assignment2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignment2.ui.theme.ASSIGNMENT2Theme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            buton()

            Column(modifier = Modifier
                .background(color = Color.Black)) {


                var module01 = Module("APPLICATIONS DEVELOPMENT PRACTICE 3",
                    "Practical module", "1 year across 4 terms")
                var module02 = Module("APPLICATIONS DEVELOPMENT THEORY 3",
                    "Theory module",
                    "1 year across 4 terms")
                var module03= Module("ICT ELECTIVES 3",
                    "Practical module", "6 months  across 2 terms")
                var module04 = Module("INFORMATION SYSTEMS 3",
                    "Practical module", "1 year across 4 terms")
                var module05= Module("PROFESSIONAL PRACTICE 3",
                    "Theory module", "6 months  across 2 terms")
                var module06= Module("PROJECT 3",
                    "Practical module", "1 year across 4 terms")
                var module07= Module("PROJECT MANAGEMENT 3",
                    "Theory module", "6 months  across 2 terms")
                var module08= Module("PROJECT PRESENTATION 3",
                    "Practical module", "1 year across 4 terms")

                val messages = listOf(module01, module02,module03, module04, module05,module06,module07,module08)
                Convesation(messages)


            }



        }
    }




}


data class Module(val moduleName:String, var moduleType: String,var duration: String)

@Composable
fun listModule(message: Module )
{

    Row(

        modifier = Modifier
            .padding(12.dp)
            .background(color = Color.White)
            .fillMaxHeight()
            .border(border = BorderStroke(4.dp, Color.Blue))
            .width(550.dp)
            .height(120.dp)
            .wrapContentSize(align = Alignment.CenterStart)

    ) {

        Column(
            modifier = Modifier

                .wrapContentSize(align = Alignment.BottomStart)
        ) {

            Image(painter = painterResource(id=R.drawable.bookn),
                contentDescription ="",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape))


        }

       Spacer(modifier = Modifier.width(23.2.dp))
     Column(modifier = Modifier.clickable {  }) {
        Text(text = "${message.moduleName}",
                color = MaterialTheme.colors.onBackground,
                style= MaterialTheme.typography.subtitle2

            )
            Spacer(modifier = Modifier.width(14.2.dp))
      Surface(shape = MaterialTheme.shapes.medium,
            ) {

                Text(text = "${message.moduleType}",style= MaterialTheme.typography.body1,
                    modifier = Modifier.padding(all = 1.6.dp),

                    maxLines = 1)


            }

            Surface(shape = MaterialTheme.shapes.medium,
                color = Color.Blue, elevation = 600.dp) {
                Text(text = "${message.duration}",style= MaterialTheme.typography.body1,
                    modifier = Modifier.padding(all = 1.6.dp),
                    maxLines =  1)


            }
        }

    }
}



@Composable
fun Convesation (messages: List<Module>)
{buton()

    LazyColumn()
    {

        items(messages) { s -> listModule(message = s) }

    }

}
@Composable
fun buton(){

    val visible: MutableState<Boolean> = remember { mutableStateOf(false) }
    AlertDialog(able = visible)
    Row() {

        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .background(color = MaterialTheme.colors.onPrimary)
                .width(800.dp)
        ){ Row(


        ){
            Button(
            onClick = {

            },

            )
        {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Back",


                )

        }
            Column(

                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .background(color = MaterialTheme.colors.onPrimary)
                    .width(800.dp)
            ) {
                Button(
                    onClick = {visible.value=true},

                    )
                {
                    Icon(
                        imageVector = Icons.Filled.ExitToApp,
                        contentDescription = "Exit",


                        )

                }
            }
        }

        }

    }
}

@Composable
fun AlertDialog(able: MutableState<Boolean>)
{
    Column(modifier = Modifier.background(Color.Blue)) {



    if(able.value) {
        AlertDialog(
            onDismissRequest = { able.value = false },
            dismissButton = {
                TextButton(onClick = { able.value = false }) {
                    Text(text = "No",
                        color = Color.Blue,
                        style = MaterialTheme.typography.subtitle1,
                        )
                }
            },
            confirmButton = {
                TextButton(onClick = { able.value = false }) {
                    Text(text = "Yes",
                        color = Color.Blue,
                        style = MaterialTheme.typography.subtitle1,
                        )
                }
            },
            title = {
                Text(text = "", color = Color.White, style = MaterialTheme.typography.subtitle1,
                    )
            },
            text = {
                Text(text = "Do you wanna Exit",
                    color = Color.Blue,
                    style = MaterialTheme.typography.body1,
                )
            }
        )

    }
    }}

