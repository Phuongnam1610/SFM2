//package com.cap.sfm.fragments;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.DialogFragment;
//
//import com.cap.sfm.Database.AllDatabase;
//import com.cap.sfm.Models.Conversation;
//import com.cap.sfm.databinding.DialogCreateBinding;
//
//public class DialogCreateFragment extends DialogFragment {
//    DialogCreateBinding binding;
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        binding = DialogCreateBinding.inflate(inflater,container,false);
//        if(binding.textname.getText().length()>0)
//        {
//            binding.okey.setOnClickListener(v -> {
//                Conversation conversation = new Conversation();
//                conversation.setTextConversation(binding.textname.getText().toString());
//                AllDatabase.getDatabase(getActivity().getApplicationContext()).textDao().inserConversation(conversation);
//
//            });
//        }
//        return binding.getRoot();
//    }
//}
