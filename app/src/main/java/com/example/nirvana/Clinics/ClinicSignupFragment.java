package com.example.nirvana.Clinics;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.nirvana.Model.CountryCode;
import com.example.nirvana.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ClinicSignupFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ClinicSignupFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Spinner spinner;
    View view1;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ClinicSignupFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ClinicSignupFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ClinicSignupFragment newInstance(String param1, String param2) {
        ClinicSignupFragment fragment = new ClinicSignupFragment();
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
        // Inflate the layout for this fragment
       view1= inflater.inflate(R.layout.fragment_clinic_signup, container, false);
        spinner = view1.findViewById(R.id.spinnerCountries);
        spinner.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, CountryCode.countryNames));
        return view1;
    }
}
