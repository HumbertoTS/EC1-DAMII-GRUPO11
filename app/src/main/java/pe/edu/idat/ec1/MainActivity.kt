package pe.edu.idat.ec1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.edu.idat.ec1.databinding.ActivityMainBinding
import java.text.DecimalFormat

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btncalcular.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        calcularpromedio()
    }

    private fun calcularpromedio() {

        val nota1 = binding.nota1.text.toString().toDouble()
        val nota2 = binding.nota2.text.toString().toDouble()
        val nota3 = binding.nota3.text.toString().toDouble()
        val sum = nota1 + nota2 + nota3
        val prom = sum / 3
        var resultado = ""

        if (prom <= 70){
            resultado= "Alumno reprobado con promedio de: ${prom}"
        } else {
            resultado= "Alumno aprobado con promedio de: ${prom}"
        }

        binding.resultado.text="$resultado"
    }
}