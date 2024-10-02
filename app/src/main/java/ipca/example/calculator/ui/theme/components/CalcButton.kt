package ipca.example.calculator.ui.theme.components

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ipca.example.calculator.ui.theme.Gray
import ipca.example.calculator.ui.theme.Black
import ipca.example.calculator.ui.theme.Orange

sealed class ButtonType {
    data object Number : ButtonType()
    object Operator : ButtonType()
    object Special : ButtonType()
}

@Preview
@Composable
fun CalcButton(
    modifier: Modifier = Modifier,
    label: String = "",
    type: ButtonType = ButtonType.Number,
    onClick: (String) -> Unit = {}
) {
    Button(
        onClick = { onClick(label) },
        modifier = modifier
            .aspectRatio(1f)
            .padding(4.dp),
        colors = when (type) {
            ButtonType.Number -> ButtonDefaults.run { buttonColors(Gray) }
            ButtonType.Operator -> ButtonDefaults.run { buttonColors(Orange) }
            ButtonType.Special -> ButtonDefaults.run { buttonColors(Black) }
        }
    )
        {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}