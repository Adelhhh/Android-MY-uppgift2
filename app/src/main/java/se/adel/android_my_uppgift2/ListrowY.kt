package se.adel.android_my_uppgift2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ListrowY(productname : String){
    Row(modifier = Modifier
        .background(Color.White)
        .fillMaxWidth()
    ) {
        Text(productname, modifier = Modifier
            .background(Color.Yellow),
            fontSize = 36.sp
            )
    }
}

@Preview
@Composable
fun ListrowYPreview(){
    ListrowY("Y")
}