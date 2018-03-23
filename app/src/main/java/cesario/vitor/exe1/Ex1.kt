package cesario.vitor.exe1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex1.*

class Ex1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex1)

        btCalcular.setOnClickListener {
            val gasolina = etGasolina.text.toString().toDouble()
            val alcool = etAlcool.text.toString().toDouble()
            var resultado = alcool / gasolina
            if (resultado < 0.7){
                tvResultado.text = "Compensa abastecer com ácool"
            } else {
                tvResultado.text = "Compensa abastecer com gasolina"
            }

        }
    }
}
