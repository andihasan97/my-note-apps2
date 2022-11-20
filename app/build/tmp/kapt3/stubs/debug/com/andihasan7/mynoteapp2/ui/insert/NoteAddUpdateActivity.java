package com.andihasan7.mynoteapp2.ui.insert;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0016\u00a2\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0004H\u0016\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/andihasan7/mynoteapp2/ui/insert/NoteAddUpdateActivity;", "", "()V", "_activityNoteAddUpdateBinding", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "isEdit", "", "note", "noteAddUpdateViewModel", "Lcom/andihasan7/mynoteapp2/ui/insert/NoteAddUpdateViewModel;", "obtainViewModel", "activity", "(Lerror/NonExistentClass;)Lcom/andihasan7/mynoteapp2/ui/insert/NoteAddUpdateViewModel;", "onBackPressed", "", "onCreate", "savedInstanceState", "(Lerror/NonExistentClass;)V", "onCreateOptionsMenu", "menu", "(Lerror/NonExistentClass;)Z", "onDestroy", "onOptionsItemSelected", "item", "showAlertDialog", "type", "", "showToast", "message", "", "Companion", "app_debug"})
public final class NoteAddUpdateActivity extends AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    public static final com.andihasan7.mynoteapp2.ui.insert.NoteAddUpdateActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_NOTE = "extra_note";
    public static final int ALERT_DIALOG_CLOSE = 10;
    public static final int ALERT_DIALOG_DELETE = 20;
    private boolean isEdit = false;
    private Note note;
    private com.andihasan7.mynoteapp2.ui.insert.NoteAddUpdateViewModel noteAddUpdateViewModel;
    private ActivityNoteAddUpdateBinding _activityNoteAddUpdateBinding;
    
    public NoteAddUpdateActivity() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    public void onCreate(@org.jetbrains.annotations.Nullable
    Bundle savedInstanceState) {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    public void onDestroy() {
    }
    
    private final com.andihasan7.mynoteapp2.ui.insert.NoteAddUpdateViewModel obtainViewModel(AppCompatActivity activity) {
        return null;
    }
    
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    Menu menu) {
        return false;
    }
    
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    MenuItem item) {
        return false;
    }
    
    public void onBackPressed() {
    }
    
    private final void showAlertDialog(int type) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/andihasan7/mynoteapp2/ui/insert/NoteAddUpdateActivity$Companion;", "", "()V", "ALERT_DIALOG_CLOSE", "", "ALERT_DIALOG_DELETE", "EXTRA_NOTE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}