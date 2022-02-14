package khusnul.nurmalasari.myppbapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fashion: ImageView = findViewById(R.id.fashion)
        fashion.setOnClickListener(this)

        val masak: ImageView = findViewById(R.id.masak)
        masak.setOnClickListener(this)

        val food: ImageView = findViewById(R.id.food)
        food.setOnClickListener(this)

        val rumah: ImageView = findViewById(R.id.rumah)
        rumah.setOnClickListener(this)

        val bayi: ImageView = findViewById(R.id.bayi)
        bayi.setOnClickListener(this)

        val kesehatan: ImageView = findViewById(R.id.kesehatan)
        kesehatan.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.fashion -> {
                val moveActivity = Intent(this, SecondActivity::class.java)
                startActivity(moveActivity)
            }
            R.id.masak -> {
                val moveActivity = Intent(this, MasakActivity::class.java)
                startActivity(moveActivity)
            }
            R.id.food -> {
                val moveActivity = Intent(this, FoodActivity::class.java)
                startActivity(moveActivity)
            }
            R.id.rumah -> {
                val moveActivity = Intent(this, RumahActivity::class.java)
                startActivity(moveActivity)
            }
            R.id.bayi -> {
                val moveActivity = Intent(this, BayiActivity::class.java)
                startActivity(moveActivity)
            }
            R.id.kesehatan -> {
                val moveActivity = Intent(this, KesehatanActivity::class.java)
                startActivity(moveActivity)
            }
}

    }

}
