package com.example.assignment2

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment2.ui.theme.ASSIGNMENT2Theme

class MainActivity2 : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Column() {


            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                Text(text = "\t        Student's Details", style= MaterialTheme.typography.body1,
                    modifier = Modifier.padding(all = 1.6.dp), textAlign = TextAlign.Center,fontSize = 30.sp
                ,fontWeight = FontWeight.ExtraBold)
            }



                Column(

                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .background(color = Color.Black)
                        .fillMaxSize()


                )
                {

                    Column(


                    ) {


                        Text(
                            buildAnnotatedString {
                                withStyle(style =SpanStyle(color = Color.Blue)) {
                                    withStyle(style = SpanStyle(color = Color.White,fontSize = 25.sp)) {

                                        append("Name: Mutamba Prince Bulambo\n")
                                    }
                                    withStyle(
                                        style = SpanStyle(
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White,
                                            fontSize = 25.sp

                                        )
                                    ) {


                                        append("\nDepartment:Information Technology\n")

                                    }
                                    withStyle(
                                        style = SpanStyle(
                                            fontWeight = FontWeight.Normal,
                                            color = Color.White,
                                            fontSize = 25.sp
                                        )
                                    ) {
                                        append("\nCourse: Application Development\n")
                                    }
                                    withStyle(
                                        style = SpanStyle(
                                            fontWeight = FontWeight.Medium,
                                            color = Color.White,
                                            fontSize = 25.sp
                                        )
                                    ) {
                                        append("\nStudentNumber: 220177767\n")
                                    }

                                }
                            }
                        )

                    }
                    Column(
                        Modifier


                            .padding(100.dp),
                        verticalArrangement = Arrangement.spacedBy(24.dp)

                    ) {

                        Button(
                            onClick = {

                                val intent = Intent(this@MainActivity2, MainActivity3::class.java)
                                startActivity(intent)

                            },
                            shape= CircleShape,
                            contentPadding = PaddingValues(16.dp),
                            border= BorderStroke(10.dp, Color.White),
                            modifier = Modifier.size(width = 360.dp,height = 60.dp),
                            colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Blue, contentColor = Color.White
                            )
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Edit,
                                contentDescription = "Edit",
                                Modifier.padding(end = 20.dp)
                            )
                            Text(text = "current modules", fontSize = 15.sp)
                        }}
                 Column(
                     verticalArrangement = Arrangement.Bottom,
                     horizontalAlignment = Alignment.CenterHorizontally,
                     modifier = Modifier.background(color = Color.LightGray)
                 ) {


                    Button(onClick = {
                        val startIntent= Intent(this@MainActivity2,MainActivity::class.java)
                        startActivity(startIntent)
                    },

                        shape= CircleShape,
                        contentPadding = PaddingValues(15.dp),
                        border= BorderStroke(10.dp, Color.White),
                        modifier = Modifier.size(width = 300.dp,height = 60.dp),
                        colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Blue, contentColor = Color.White
                        )




                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "ArrowBack ",
                            Modifier.padding(end = 20.dp)
                        )
                        Text(text = "Back\n", fontSize = 18.sp)
                    }}
                }}






            }
        }}





