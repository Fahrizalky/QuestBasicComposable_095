package com.example.projectempty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.projectempty.ui.theme.ProjectEmptyTheme
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectEmptyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                 BasicCompose(
                        modifier = Modifier.padding(innerPadding),
                 )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun BasicCompose(
    modifier: Modifier = Modifier
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()

    ){
        Text(
            text = "Login ",
            style =  TextStyle(
                fontSize = 70.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
            )
        )

        Text(
            text = "Ini adalah halaman Login ",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
        )

        val imageModifier = Modifier
            .size(300.dp)
            .padding(top = 40.dp, bottom = 0.dp)


        Image(
            painter = painterResource(id = R.drawable.umy2),
            contentDescription = null,
            modifier = imageModifier
        )//atau ""

        Text(
            text ="Nama",
            fontSize = 25.sp

        )

        Text(
            text = "Fahrizal Kusuma Yuda",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red
        )

        Text(
            text = "20220140095",
            fontSize = 45.sp
        )
val sizeFoto = Modifier
    .width(250.dp)
    .height(400.dp)
    .clip(RoundedCornerShape(250.dp))
    .border(5.dp, Color.Gray)


        Image(
            painter = painterResource(id = R.drawable.kmti),
            contentDescription = null,
            modifier = sizeFoto

        )
    }

}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProjectEmptyTheme {
        Greeting("Android")
    }
}