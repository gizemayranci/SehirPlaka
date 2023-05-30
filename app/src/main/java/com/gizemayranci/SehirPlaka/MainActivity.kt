package com.gizemayranci.SehirPlaka
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gizemayranci.SehirPlaka.databinding.ActivityMainBinding
import com.gizemayranci.SehirPlaka.ui.theme.SehirPlakaTheme

class MainActivity : ComponentActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main);
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if(binding.editTextNumber.text.isNotEmpty()){
                var plakaKodu = binding.editTextNumber.text.toString().toInt();
                var plakaNo = "(" + plakaKodu.toString() + ") ";
                when(plakaKodu){
                    34 -> binding.textView.text = plakaNo + "İstanbul";
                    35 -> binding.textView.text = plakaNo + "İzmir";
                    6 -> binding.textView.text = plakaNo + "Ankara";
                    16 -> binding.textView.text = plakaNo + "Bursa";
                    17 -> binding.textView.text = plakaNo + "Çanakkale";
                    20 -> binding.textView.text = plakaNo + "Denizli";
                    61 -> binding.textView.text = plakaNo + "Trabzon";
                    else -> {
                        binding.textView.text = "Bulunamadı!!!";
                    }
                }
                binding.editTextNumber.text.clear();
            }
            else {
                binding.textView.text = "Şehir plaka kodunu giriniz..";
            }
        }
    }
}
