package in.rahulja.ficsavemiddleware;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DeveloperDialogFragment extends DialogFragment {

  public DeveloperDialogFragment() {
    // Required empty public constructor
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_developer_dialog, container, false);
  }

  public interface DeveloperDialogListener {
    void onDialogPositiveClick(DialogFragment dialog);

    void onDialogNegativeClick(DialogFragment dialog);
  }
}
