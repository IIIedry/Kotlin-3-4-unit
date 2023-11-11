package com.example.addaviewmodel

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.addaviewmodel.ui.theme.AddAViewModelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate Called")

        setContent {
            AddAViewModelTheme {
                DessertClickerApp()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Called")
    }
}

@Composable
fun DessertClickerApp(){}


@Preview
@Composable
fun MyDessertClickerAppPreview() {
    AddAViewModelTheme {
        DessertClickerApp(
            uiState = DessertUiState(),
            onDessertClicked = {}
        )
    }
}