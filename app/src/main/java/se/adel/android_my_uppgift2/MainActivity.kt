package se.adel.android_my_uppgift2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.adel.android_my_uppgift2.ui.theme.AndroidMYuppgift2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidMYuppgift2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Listitem()
                }
            }
        }
    }
}

@Composable
fun Listitem(){

    var listItemX = remember { mutableStateListOf("") }
    var listitemY = remember { mutableStateListOf("") }

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {

        Column {
        Row(modifier = Modifier
            .background(Color.Blue)
            .height(100.dp)
            .fillMaxWidth()
            .padding(30.dp)
        ) {

            Spacer(modifier = Modifier.width(30.dp))

            Button(onClick = {
                listItemX.add("X")
            }, modifier = Modifier.width(100.dp)) {
                Text(text = "X")
            }

            Spacer(modifier = Modifier.weight(1F))

            Button(onClick = {
                listitemY.add("Y")
            }, modifier = Modifier.width(100.dp)) {
                Text(text = "Y")
            }

            Spacer(modifier = Modifier.width(30.dp))

        }}
            LazyColumn() {

                items(listItemX) { xitem ->
                    ListrowX(productname = xitem)
                }

                items(listitemY) { listitemY ->
                    ListrowY(productname = listitemY)
                }
            }

        Spacer(modifier = Modifier.weight(1F))

        Column {

            Button(
                onClick = {
                 listItemX.clear()
                    listitemY.clear()
                },
                modifier = Modifier
                    .width(200.dp)
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                Text(text = "RESET")
            }
        }

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
    AndroidMYuppgift2Theme {
       // Greeting("Android")

        Listitem()
    }
}