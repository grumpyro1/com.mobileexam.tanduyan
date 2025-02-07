package com.example.commobileexamtanduyan.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.commobileexamtanduyan.R
val PoppinsBold = FontFamily(
    Font(R.font.poppins_bold),
)
val PoppinsLight = FontFamily(
    Font(R.font.poppins_light),
)
val PoppinsThin = FontFamily(
    Font(R.font.poppins_thin),
)
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = PoppinsBold,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = PoppinsLight,
        fontWeight = FontWeight.Normal
    ),
    bodySmall = TextStyle(
        fontFamily = PoppinsLight,
        fontWeight = FontWeight.Normal
    )
)