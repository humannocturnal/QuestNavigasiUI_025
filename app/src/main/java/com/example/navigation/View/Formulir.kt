package com.example.navigation.View

import android.R.attr.text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.R
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK: List<String> = listOf("laki-laki", "perempuan"),
    onSubmitBTNClick: () -> Unit
) {
    Scaffold (modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text= stringResource(id= R.string.home), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id=R.color.teal.700))
            )}
    ){}
}