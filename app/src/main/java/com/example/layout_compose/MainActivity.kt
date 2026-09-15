   package com.example.layout_compose

import android.R.attr.name
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layout_compose.ui.theme.LayoutcomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayoutcomposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LayoutScreen(
                        modifier = Modifier
                            .padding(innerPadding)


                    )
                    }
                }
            }
        }
    }


   @Composable
   fun LayoutScreen(modifier: Modifier = Modifier) {
       Column(
           modifier = modifier.background(Color.Blue)
               .fillMaxSize(),
       ) {
           Column(
               modifier = Modifier
                   .background(Color.Yellow)
                   .weight(1f)
                   .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly

           ) {
               Text("Texto1")
               Text("Texto2")
               Text("Texto3")

           }


           Row(
               modifier = Modifier
                   .background(Color.Gray)
                   .weight(1f)
                   .fillMaxSize(),
               verticalAlignment = Alignment.CenterVertically,
               horizontalArrangement = Arrangement.SpaceEvenly



           ) {
               Text("Texto4")
               Text("Texto5")
               Text("Texto6")

           }

       }

   }