package com.example.artshowcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.artshowcase.ui.theme.ArtShowcaseTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtShowcaseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArtApp()
                }
            }
        }
    }
}





@Composable
fun ArtApp() {
    var result by remember { mutableStateOf( 1) }
    var pname = ""
    var pauthor = ""
    var pimage = R.drawable.ic_launcher_foreground
  //if

    when(result){
        1 -> {
            pimage = R.drawable.arrival_1877_claudemonet
            pauthor = "Claude Monet, 1877"
            pname = "Arrival"
        }
        2 -> {
            pimage = R.drawable.ballet_1877_hilaire_germain_edgar_degas
            pauthor = "Hilaire Germain Edgar Degas, 1877"
            pname = "ballet"
        }
        3 -> {
            pimage = R.drawable.beach_1867_claudemonet
            pauthor = "Claude Monet, 1867"
            pname = "beach"
        }
        4 -> {
            pimage = R.drawable.bedrrom_1889_vangogh
            pauthor = "Vincent Van Gogh, 1889"
            pname = "bedroom"
        }
        5 -> {
            pimage = R.drawable.guitarist_1903_pablopicasso
            pauthor = "Pablo Picasso, 1903"
            pname = "guitarist"
        }
        6 -> {
            pimage = R.drawable.nighthawks_1942_edwardhopper
            pauthor = "Edward Hopper, 1942"
            pname = "nighthawks"
        }
        7 -> {
            pimage = R.drawable.paris_1877_gustavecaillebotte
            pauthor = "Gustave Caillebotte, 1877"
            pname = "paris"
        }
        8 -> {
            pimage = R.drawable.sacks_1890_claudemonet
            pauthor = "Claude Monet, 1890"
            pname = "sacks"
        }
        9 -> {
            pimage = R.drawable.starry_1972_almathomas
            pauthor = "Alma Thomas, 1972"
            pname = "starry"
        }
        10 -> {
            pimage = R.drawable.sunday_1884_georgesseurat
            pauthor = "Georges Seurat, 1884"
            pname = "sunday"
        }
        11 -> {
            pimage = R.drawable.water_1906_claudemonet
            pauthor = "Claude Monet, 1906"
            pname = "water"
        }
        else -> {
            pimage = R.drawable.wave_1830_kanagawaokinamiura
            pauthor = "Kanagawa Okina Miura, 1830"
            pname = "wave"
        }
    }


    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth().fillMaxHeight())
    {
        var pinturasName = "$pname"
        var pinturasAuthor = "$pauthor"
        Text(text = pinturasName, fontFamily = FontFamily.Cursive, fontSize = 53.sp, modifier = Modifier.padding(40.dp))

        Image(painter = painterResource(id = pimage), contentDescription = "painting",
            contentScale =  ContentScale.FillHeight, alignment = Alignment.BottomCenter,
            modifier = Modifier.fillMaxWidth().padding(top = 45.dp)
                .size(height =290.dp, width = 500.dp))

        Text(text = pinturasAuthor, fontSize = 15.sp)
        Row(modifier = Modifier.padding(30.dp)) {
            Button(onClick = { if (result > 1) result-- else result = 12}, modifier = Modifier.width(120.dp)) { Text(
                text = "Previous")}
            Spacer(modifier = Modifier.width(10.dp))
            Button(onClick = { if (result < 12) result++ else result = 1}, modifier = Modifier.width(120.dp)) { Text(
                text = "Next"
            )}
        }


    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ArtShowcaseTheme {
        ArtApp()
    }
}



/*  if(result == 1) {
        pimage = R.drawable.ic_launcher_background
    }
    else if(result == 2) {
        pimage = R.drawable.ic_launcher_foreground
    }
    else if(result ==3) {
        pimage = R.drawable.ic_launcher_background
    }
    else if(result==4){
            pimage = R.drawable.ic_launcher_background
    }
    else if(result == 2) {
        pimage = R.drawable.ic_launcher_foreground
    }
    else if(result ==3) {
        pimage = R.drawable.ic_launcher_background
    }
    else if(result==4){
        pimage = R.drawable.ic_launcher_background
    }
    else if(result == 2) {
        pimage = R.drawable.ic_launcher_foreground
    }
    else if(result ==3) {
        pimage = R.drawable.ic_launcher_background
    }
    else if(result==4){
        pimage = R.drawable.ic_launcher_background
    }
        else pimage = R.drawable.ic_launcher_foreground
*/