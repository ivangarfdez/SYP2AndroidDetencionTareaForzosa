package es.florida_uni.dam.practica2;


import android.util.Log;

public class TareaMuyCostosa implements Runnable{

    final static String TAG = "SYP-practica2";

    @Override
    public void run(){
        Log.i(TAG, "Tarea muy costosa iniciada");

        //TODO: Interrumpir la ejecución cuando el usuario se haya cansado de esperar
        try {
            for(int i=0;i<100;i++){
                Log.i(TAG, "Tarea muy costosa en marcha...");
                Log.i(TAG, "Tarea muy costosa funcionando.");


                Thread.sleep(1000);
            }
        } catch(InterruptedException e){

        }

        Log.i(TAG, "Tarea muy costosa finalizada...");
        Log.i(TAG, "Detenida la tarea forzosa...");
        Log.i(TAG, "Fin");
    }

}
