package com.hcondor.t2_condorlunahimerjerly.ui.mascota;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0016\u0017B;\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\b2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/hcondor/t2_condorlunahimerjerly/ui/mascota/MascotaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hcondor/t2_condorlunahimerjerly/ui/mascota/MascotaAdapter$MascotaViewHolder;", "mascotas", "", "Lcom/hcondor/t2_condorlunahimerjerly/data/model/Mascota;", "onEditarClick", "Lkotlin/Function1;", "", "onEliminarClick", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "actualizarLista", "nuevaLista", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MascotaDiffCallback", "MascotaViewHolder", "app_debug"})
public final class MascotaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.hcondor.t2_condorlunahimerjerly.ui.mascota.MascotaAdapter.MascotaViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.hcondor.t2_condorlunahimerjerly.data.model.Mascota> mascotas;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.hcondor.t2_condorlunahimerjerly.data.model.Mascota, kotlin.Unit> onEditarClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.hcondor.t2_condorlunahimerjerly.data.model.Mascota, kotlin.Unit> onEliminarClick = null;
    
    public MascotaAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.hcondor.t2_condorlunahimerjerly.data.model.Mascota> mascotas, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.hcondor.t2_condorlunahimerjerly.data.model.Mascota, kotlin.Unit> onEditarClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.hcondor.t2_condorlunahimerjerly.data.model.Mascota, kotlin.Unit> onEliminarClick) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.hcondor.t2_condorlunahimerjerly.ui.mascota.MascotaAdapter.MascotaViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.hcondor.t2_condorlunahimerjerly.ui.mascota.MascotaAdapter.MascotaViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void actualizarLista(@org.jetbrains.annotations.NotNull()
    java.util.List<com.hcondor.t2_condorlunahimerjerly.data.model.Mascota> nuevaLista) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/hcondor/t2_condorlunahimerjerly/ui/mascota/MascotaAdapter$MascotaDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/hcondor/t2_condorlunahimerjerly/data/model/Mascota;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "app_debug"})
    public static final class MascotaDiffCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.hcondor.t2_condorlunahimerjerly.data.model.Mascota> oldList = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.hcondor.t2_condorlunahimerjerly.data.model.Mascota> newList = null;
        
        public MascotaDiffCallback(@org.jetbrains.annotations.NotNull()
        java.util.List<com.hcondor.t2_condorlunahimerjerly.data.model.Mascota> oldList, @org.jetbrains.annotations.NotNull()
        java.util.List<com.hcondor.t2_condorlunahimerjerly.data.model.Mascota> newList) {
            super();
        }
        
        @java.lang.Override()
        public int getOldListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public int getNewListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/hcondor/t2_condorlunahimerjerly/ui/mascota/MascotaAdapter$MascotaViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hcondor/t2_condorlunahimerjerly/databinding/ItemMascotaBinding;", "(Lcom/hcondor/t2_condorlunahimerjerly/ui/mascota/MascotaAdapter;Lcom/hcondor/t2_condorlunahimerjerly/databinding/ItemMascotaBinding;)V", "getBinding", "()Lcom/hcondor/t2_condorlunahimerjerly/databinding/ItemMascotaBinding;", "app_debug"})
    public final class MascotaViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.hcondor.t2_condorlunahimerjerly.databinding.ItemMascotaBinding binding = null;
        
        public MascotaViewHolder(@org.jetbrains.annotations.NotNull()
        com.hcondor.t2_condorlunahimerjerly.databinding.ItemMascotaBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.hcondor.t2_condorlunahimerjerly.databinding.ItemMascotaBinding getBinding() {
            return null;
        }
    }
}