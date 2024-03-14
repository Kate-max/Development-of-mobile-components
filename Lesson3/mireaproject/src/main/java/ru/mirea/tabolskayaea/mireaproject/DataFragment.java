package ru.mirea.tabolskayaea.mireaproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DataFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DataFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DataFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DataFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DataFragment newInstance(String param1, String param2) {
        DataFragment fragment = new DataFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_data, container, false);
        TextView t1 = view.findViewById(R.id.textView4);
        t1.setText("Транспортная отрасль.");

        TextView t2 = view.findViewById(R.id.textView3);
        t2.setText("Транспортная система России — совокупность транспортных средств, инфраструктуры и управления, функционирующих на территории Российской Федерации.");

        TextView t3 = view.findViewById(R.id.textView6);
        t3.setText("Основные задачи транспорта");

        TextView t4 = view.findViewById(R.id.textView7);
        t4.setText("1. Обеспечивает производственные связи отдельных звеньев хозяйства и районов страны.");

        TextView t5 = view.findViewById(R.id.textView9);
        t5.setText("2. Способствует специализации и кооперированию предприятий, отраслей, районов. ");

        TextView t6 = view.findViewById(R.id.textView10);
        t6.setText("3. Осуществляет внешнюю торговлю страны.");

        return view;
    }
}