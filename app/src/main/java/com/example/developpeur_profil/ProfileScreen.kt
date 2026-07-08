package com.example.developpeur_profil.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.developpeur_profil.R

@Composable
fun ProfileScreen() {

    val skills = listOf(
        "Kotlin",
        "Jetpack Compose",
        "Java",
        "Git",
        "Firebase"
    )

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        LazyColumn(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            item {

                Image(
                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = "Avatar",
                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Mohamed Ali",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Développeur Android"
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Étudiant passionné par le développement mobile avec Kotlin et Jetpack Compose."
                )

                Spacer(modifier = Modifier.height(20.dp))

                OutlinedTextField(
                    value = "mohamed@email.com",
                    onValueChange = {},
                    readOnly = true,
                    leadingIcon = {
                        Icon(Icons.Default.Email, null)
                    }
                )

                Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value = "Montréal",
                    onValueChange = {},
                    readOnly = true,
                    leadingIcon = {
                        Icon(Icons.Default.LocationOn, null)
                    }
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Compétences",
                    style = MaterialTheme.typography.headlineSmall
                )

                Spacer(modifier = Modifier.height(10.dp))
            }

            items(skills) { skill ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 5.dp)
                ) {

                    Text(
                        text = skill,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }

            item {

                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    onClick = { }
                ) {
                    Text("Contacter")
                }
            }
        }
    }
}