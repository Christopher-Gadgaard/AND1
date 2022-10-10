package dk.via.and1.interaction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView textView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonC;
    Button button0;
    Button buttonEq;
    Button buttonPlus;
    int sum = 0;
    int temp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView = findViewById(R.id.sumOfCalc);
        textView.setText("0");

        button0 = findViewById(R.id.calc0);
        button1 = findViewById(R.id.calc1);
        button2 = findViewById(R.id.calc2);
        button3 = findViewById(R.id.calc3);
        button4 = findViewById(R.id.calc4);
        button5 = findViewById(R.id.calc5);
        button6 = findViewById(R.id.calc6);
        button7 = findViewById(R.id.calc7);
        button8 = findViewById(R.id.calc8);
        button9 = findViewById(R.id.calc9);
        buttonEq = findViewById(R.id.calcEq);
        buttonPlus = findViewById(R.id.calcPlus);
        buttonC = findViewById(R.id.calcC);
    }


    public void calcOnClick(View view) {
   /*     if (Integer.parseInt(textView.getText().toString()) == 0) {
            textView.setText("");
        }

        textView.append(view.get);

        if (view.getId() == R.id.calc0) {
            textView.append("0");
        } else if (view.getId() == R.id.calc1) {
            textView.append("1");
        } else if (view.getId() == R.id.calc2) {
            textView.append("2");
        } else if (view.getId() == R.id.calc3) {
            textView.append("3");
        } else if (view.getId() == R.id.calc4) {
            textView.append("4");
        } else if (view.getId() == R.id.calc5) {
            textView.append("5");
        } else if (view.getId() == R.id.calc6) {
            textView.append("6");
        } else if (view.getId() == R.id.calc7) {
            textView.append("7");
        } else if (view.getId() == R.id.calc8) {
            textView.append("8");
        } else if (view.getId() == R.id.calc9) {
            textView.append("9");
        }*/
    }

    public void calc1OnClick(View view) {
        if (Integer.parseInt(textView.getText().toString()) == 0) {
            textView.setText("");
        }
        textView.append("1");
    }

    public void calc2OnClick(View view) {
        if (Integer.parseInt(textView.getText().toString()) == 0) {
            textView.setText("");
        }
        textView.append("2");
    }

    public void calc3OnClick(View view) {
        if (Integer.parseInt(textView.getText().toString()) == 0) {
            textView.setText("");
        }
        textView.append("3");
    }

    public void calc4OnClick(View view) {
        if (Integer.parseInt(textView.getText().toString()) == 0) {
            textView.setText("");
        }
        textView.append("4");
    }

    public void calc5OnClick(View view) {
        if (Integer.parseInt(textView.getText().toString()) == 0) {
            textView.setText("");
        }
        textView.append("5");
    }

    public void calc6OnClick(View view) {
        if (Integer.parseInt(textView.getText().toString()) == 0) {
            textView.setText("");
        }
        textView.append("6");
    }

    public void calc7OnClick(View view) {
        if (Integer.parseInt(textView.getText().toString()) == 0) {
            textView.setText("");
        }
        textView.append("7");
    }

    public void calc8OnClick(View view) {
        if (Integer.parseInt(textView.getText().toString()) == 0) {
            textView.setText("");
        }
        textView.append("8");
    }

    public void calc9OnClick(View view) {
        if (Integer.parseInt(textView.getText().toString()) == 0) {
            textView.setText("");
        }
        textView.append("9");
    }

    public void calcCOnClick(View view) {
        textView.setText("0");
    }

    public void calc0OnClick(View view) {
        if (Integer.parseInt(textView.getText().toString()) == 0) {
            textView.setText("");
        }
        textView.append("0");
    }

    public void calcPlusOnClick(View view) {

    }

    public void calcEqOnClick(View view) {
    }
}